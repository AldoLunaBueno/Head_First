class Animal
  # shortcut for defining reader methods
  attr_reader :name, :age

  def name=(value)
    if value == "" or value.nil?
      raise "Name can't be blank!"
    end
    @name = value
  end

  def age=(value)
    if value < 0
      raise "An age of #{value} isn't valid!"
    end
    @age = value
  end

  def report_age
    puts "#{@name} is #{@age} years old."
  end

  def talk
    puts "#{@name} says Bark!"
  end

  def move(destination)
    puts "#{@name} runs to the #{destination}."
  end
end

class Dog < Animal
    def to_s
        "#{@name} the dog, age #{@age}"
    end
end

class Cat < Animal
end

class Bird < Animal
end
