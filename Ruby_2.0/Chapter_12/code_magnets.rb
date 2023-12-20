def drive(destination)
  if destination == "Hawaii"
    raise "You can't drive to Hawaii!"
  end
end

begin
  drive "Hawaii"
rescue  => exception
  puts exception.message
end
