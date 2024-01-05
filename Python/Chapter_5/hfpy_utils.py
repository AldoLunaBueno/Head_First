def convert2range(x, x_min, x_max, y_min, y_max):
    """Given a value (x) in the range f_min-f_max, convert the value
    to its equivalent value in the range t_min-t_max.

    Based on the technique described here:
        http://james-ramsden.com/map-a-value-from-one-number-scale-to-another-formula-and-c-code/
    """
    q = (x - x_min) / (x_max - x_min)
    return round(y_min + q * (y_max - y_min), 2)