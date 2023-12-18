class Employee
  attr_reader :name

  def name=(name)
    if name == ""
      raise "Name can't be blank!"
    end
    @name = name
  end

  def initialize(name)
    self.name = name
  end

  def print_name
    puts "Name: #{name}"
  end
end

class SalariedEmployee < Employee
  attr_reader :salary

  def salary=(salary)
    if salary < 0
      raise "A salary of #{salary} isn't valid!"
    end
    @salary = salary
  end

  def initialize(name = "Anonymous", salary = 0.0)
    super(name)
    self.salary = salary
  end

  def print_pay_stub
    print_name
    pay_for_period = (salary / 365.0) * 14
    # puts format("Pay This Period: $%.2f", pay_for_period)
    # puts "Pay This Period: $#{'%.2f' % pay_for_period}"
    puts "Pay This Period: $#{pay_for_period.round(2)}"
  end
end

class HourlyEmployee < Employee
    
  def self.security_guard(name)
    self.new(name, 19.25, 30)
  end

  def self.cashier(name)
    self.new(name, 12.75, 25)
  end

  def self.janitor(name)
    self.new(name, 10.50, 20)
  end

  attr_reader :hourly_wage, :hours_per_week

  def hourly_wage=(value)
    if value < 0
      raise "Hourly wage can't be negative"
    end
    @hourly_wage = value
  end

  def hours_per_week=(value)
    if value < 0
      raise "Hours per week can't be negative"
    end
    @hours_per_week = value
  end

  def initialize(name = "Anonymous", hourly_wage = 0.0, hours_per_week = 0.0)
    super(name)
    self.hourly_wage = hourly_wage
    self.hours_per_week = hours_per_week
  end

  def print_pay_stub
    print_name
    pay_for_period = hourly_wage * hours_per_week * 2
    puts "Pay This Period: $#{pay_for_period.round(2)}"
  end
end

=begin
ivan    = HourlyEmployee.new("Ivan Stokes",     12.75, 25)
harold  = HourlyEmployee.new("Harold Nguyen",   12.75, 25)
tamara  = HourlyEmployee.new("Tamara Wells",    12.75, 25)
susie   = HourlyEmployee.new("Susie Powell",    12.75, 25)

edwin   = HourlyEmployee.new("Edwin Burgess",   10.50, 20)
ethel   = HourlyEmployee.new("Ethel Harris",    10.50, 20)

angela  = HourlyEmployee.new("Angela Matthews", 19.25, 30)
stewart = HourlyEmployee.new("Stewart Sanchez", 19.25, 30)
=end

ivan = HourlyEmployee.security_guard("Ivan Stokes")
harold = HourlyEmployee.security_guard("Harold Nguyen")
tamara = HourlyEmployee.security_guard("Tamara Wells")
susie = HourlyEmployee.security_guard("Susie Powell")

puts ivan.print_pay_stub
