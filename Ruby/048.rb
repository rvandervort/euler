
def calc
  (1..1000).map { |f| f**f }.reduce(&:+)
end
