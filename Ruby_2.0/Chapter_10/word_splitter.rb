# WordSplitter as example of how to mix Enumerable in

# This class allows you to perform various operations
# on the words in a string.
class WordSplitter
  include Enumerable

  # The string to split into words.
  attr_accessor :string

  # Passes each word in the string to a block, one
  # at a time.
  def each
    string.split(" ").each do |word|
      yield word
    end
  end
end

splitter = WordSplitter.new
splitter.string = "one two three four"

puts "-" * 30
puts "The fundamental method: each"
splitter.each do |word|
  puts word
end

puts "-" * 30
puts "Some methods that require pass a block"

splitter = WordSplitter.new
splitter.string = "how do you do"

p splitter.find_all { |word| word.include?("d") }
p splitter.reject { |word| word.include?("d") }
p splitter.partition { |word| word.include?("d") }
p splitter.map { |word| word.reverse }

puts "-" * 30
puts "Methods that don't require pass a block"

p splitter.count
p splitter.first
p splitter.sort
p splitter.to_a
