def send_sos
  raise "Latitude -50.75, Longitude 166.04"
end

begin
  send_sos
rescue => error
  puts "Sending rescue party to #{error.message}"
end
