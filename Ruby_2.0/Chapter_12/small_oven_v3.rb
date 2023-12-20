class OvenOffError < StandardError
end

class OvenEmptyError < StandardError
end

class SmallOven
  attr_accessor :contents

  def turn_on
    puts "Turning oven on."
    @state = "on"
  end

  def turn_off
    puts "Turning oven off."
    @state = "off"
  end

  def bake
    if @state == "off"
      raise OvenOffError, "You need to turn the oven."
    end
    if @contents == nil
      raise OvenEmptyError, "There's nothing in the oven"
    end
    "golden-brown #{contents}"
  end
end

dinner = ["turkey", nil, "pie"]
oven = SmallOven.new
oven.turn_off
dinner.each do |item|
  begin
    oven.contents = item
    puts "Serving #{oven.bake}."
  rescue OvenEmptyError => exception
    puts "Error: #{exception.message}"
  rescue OvenOffError => exception
    puts "Error: #{exception.message}"
    oven.turn_on
    retry
  ensure
    oven.turn_off
  end
end
