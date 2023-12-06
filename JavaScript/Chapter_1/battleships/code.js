randomLoc = Math.floor(Math.random() * 5)

const location1 = randomLoc
const location2 = randomLoc + 1
const location3 = randomLoc + 2

let guess
let hits = 0
let guesses = 0
let isSunk = false

while (isSunk == false) {
    // input
    guess = prompt("Ready, aim, fire! (enter a number 0-6):")

    // validation
    if (isNaN(guess)) {
        alert("Please enter a valid number")
        continue
    }
    if (guess < 0 || guess > 6) {
        alert("Please enter a valid cell number inside the table 0-6")
        continue
    }

    guesses += 1
    if (!(guess == location1 || guess == location2 || guess == location3))  {
        alert("MISS")
        continue
    }
    alert("HIT!")
    hits += 1
    if (hits == 3) {
        isSunk = true
        alert("You sank my battleship!")
    }   
}
alert("Your stats:\n- guesses: " + 
    guesses + "\n- hits: " + hits + "\n- missings: " + (guesses - hits) +
    "\n- accuracy: " + 100*(3/guesses))