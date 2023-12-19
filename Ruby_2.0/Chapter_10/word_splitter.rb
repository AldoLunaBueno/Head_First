# WordSplitter as example of how to mix Enumerable in

class WordSplitter
  include Enumerable
  attr_accessor :string

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
