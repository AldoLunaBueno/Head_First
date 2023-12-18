def total(prices)
  amount = 0
  prices.each { |price| amount += price }
  amount
end

def refund(prices)
  amount = 0
  prices.each { |price| amount -= price }
  amount
end

def show_discounts(prices)
  prices.each do |price|
    price_discount = price / 3.0
    puts "Your discount: $#{price_discount.round(2)}"
  end
end

prices = [3.99, 25.00, 8.99]

puts total(prices).round(2)
puts refund(prices).round(2)
show_discounts(prices)
