# Rescuing exceptions

def trip_over_curb
  rais "WHOA!"
end

begin
  trip_over_curb
rescue
  puts "Caught you!"
end
