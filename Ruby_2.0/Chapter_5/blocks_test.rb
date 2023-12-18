def twice(&my_block)
  puts "In the method, about to call the block!"
  my_block.call
  puts "Back in the method, about to call the block again!"
  my_block.call
  puts "Back in the method, about to return!"
end

twice do
  puts "Woooo!"
end

#------------
puts "-" * 30

def give_1(&my_block)
  my_block.call("2 turtle doves", "1 partridge")
end

give_1 do |present1, present2|
  puts "My method gave to me..."
  puts present1, present2
end

def give_2
  yield "2 turtle doves", "1 partridge"
end

give_2 do |present1, present2|
  puts "My method gave to me..."
  puts present1, present2
end

#------------
puts "-" * 30

def run_block
  yield
end

run_block do
  puts "do/end"
end
run_block { puts "braces" }

def take_this
  yield "present"
end

take_this do |thing|
  puts "do/end block got #{thing}"
end
take_this { |thing| puts "braces block got #{thing}" }
