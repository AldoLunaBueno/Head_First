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
        raise "You need to turn the oven."
      end
      if @contents == nil
        raise "There's nothing in the oven"
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
    rescue => exception
      puts "Error: #{exception.message}"
    end
  end