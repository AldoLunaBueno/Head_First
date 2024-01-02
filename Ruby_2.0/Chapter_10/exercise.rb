# Comparing grades

class Grade
  include Comparable
  LETTERS_NUMS = {"A"=>6, "B"=>5, "C"=>4, "D"=>3, "E"=>2, "F"=>1}
  attr_reader :letter

  def initialize(letter)
    self.letter = letter
  end

  def <=>(other_grade)
    LETTERS_NUMS[letter] <=> LETTERS_NUMS[other_grade.letter]
  end

  def letter=(letter)
    unless LETTERS_NUMS.include?(letter)
      raise "You must provide a letter between A-F"
    end
    @letter = letter
  end
end

a_grade = Grade.new("A")
b_grade = Grade.new("B")
c_grade = Grade.new("C")
d_grade = Grade.new("D")
f_grade = Grade.new("F")

puts "a_grade > c_grade: #{a_grade > c_grade}"
puts "f_grade < d_grade: #{f_grade < d_grade}"
puts "b_grade > a_grade: #{b_grade > a_grade}"
puts "a_grade == a_grade: #{a_grade == a_grade}"