lines = []
File.open("reviews.txt") do |review_file|
  lines = review_file.readlines
end

relevant_lines = lines.find_all { |line| line.include?("Truncated") }
reviews = relevant_lines.reject { |line| line.include?("--") }

def find_adjective(string)
  words = string.split(" ")
  index = words.find_index("is")
  words[index + 1]
end

=begin
# Too verbose
adjectives = []
reviews.each { |line| adjectives << find_adjective(line) }
=end
adjectives = reviews.map do |line| 
    adjective = find_adjective(line)
    "\"#{adjective.capitalize}\""
end

puts "The critics agree, Truncated is:"
puts adjectives
