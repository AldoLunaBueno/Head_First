from flask import Flask, session, render_template

import os
import swimclub

app = Flask(__name__)

# Esta llave secreta es usada por Flask para encriptar
# cualquier cookie enviada al navegador web.
app.secret_key = "You will never guess..."

@app.get("/")
def index():
    #return "This is a placeholder for your webapp's openning web."
    return render_template(
        "index.html",
        title = "The Swimclub system",
    )

@app.get("/swimmers")
def display_swimmers():
    populate_data()
    return str(sorted(session["swimmers"]))

@app.get("/files/<swimmer>")
def get_swimmers_files(swimmer):
    populate_data()
    return str(session["swimmers"][swimmer])

def populate_data():
    if "swimmers" in session:
        return
    file_names = os.listdir(swimclub.FOLDER)
    try:
        file_names.remove(".DS_Store")
    except:
        print("")
    session["swimmers"] = {}
    for fn in file_names:
        name = fn.split("-")[0]
        # name, *rest = swimclub.read_swim_data(fn)
        if name not in session["swimmers"]:  
            session["swimmers"][name] = []
        session["swimmers"][name].append(fn)



if __name__ == "__main__":
    app.run(debug = True)