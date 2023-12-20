require 'minitest/autorun'

# ruby 2.0.0 / minitest 4.3.2 / psych 2.0.0
# Please upgrade psych to a version that 
# supports safe loading (>= 2.0).
# Esto no funciona:
# class TestSomething < Minitest::TestCase
class TestSomething < MiniTest::Unit::TestCase
  def test_true_assertion
    assert(true)
  end

  def test_false_assertion
    assert(false)
  end
end
