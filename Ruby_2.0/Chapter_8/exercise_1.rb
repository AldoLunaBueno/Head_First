# Softball team

staff = ["Walsh", "Moreno", "Nash", "Cox",
         "Rios", "Jones", "Gupta", "Hayes"]

softball_team = staff.clone
# Esto parece hacer lo mismo:
# softball_team = staff.dup 

staff << "Wagner"
softball_team << "Zonky the Wonder Squirrel"

puts "Company staff:", staff
print "\n\n"
puts "Company softball team:", softball_team
