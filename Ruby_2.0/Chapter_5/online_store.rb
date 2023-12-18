def total(prices)
  amount = 0
  index = 0
  while index < prices.length
    amount += prices[index]
    index += 1
  end
  amount
end

def refund(prices)
  amount = 0
  index = 0
  while index < prices.length
    amount -= prices[index]
    index += 1
  end
  amount
end

def show_discounts(prices)
  index = 0
  while index < prices.length
    price_discount = prices[index] / 3.0
    puts "Your discount: $#{price_discount.round(2)}"
    index += 1
  end
end

prices = [3.99, 25.00, 8.99]

puts total(prices).round(2)
puts refund(prices).round(2)
show_discounts(prices)
