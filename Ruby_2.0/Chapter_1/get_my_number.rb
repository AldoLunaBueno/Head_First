# Get My Number Game
# Written by: ALB

puts "Welcome to 'Get My Number!'"

# Get the player's name, and greet them.
print "What's your name? "
input = gets # p input
name = input.chomp
puts "Welcome, #{name}!"

# Store a random number for the player to guess.
puts "I've got a random number between 1 and 100."
puts "Can you guess it?"
target = rand(10) + 1

# Track how many guesses the player has made.
num_guesses = 0

# Track whether the player has guessed correctly.
guessed_it = false

until num_guesses == 10 || guessed_it
    puts "You've got #{10 - num_guesses} guesses left."
    print "Make a guess: "
    guess = gets.to_i

    # Track whether the player has guessed correctly.
    guessed_it = false
    
    num_guesses += 1

    # Compare the guess to the target.
    if guess < target
        puts "Oops. Your guess was LOW."
    elsif guess > target
        puts "Oops. Your guess was HIGH."
    else
        puts "Good job, #{name}!", 
            "You guessed my number in #{num_guesses} guesses!"
        guessed_it = true
    end
end

if not guessed_it
    puts "Sorry. You didn't get my number. It was #{target}."
end