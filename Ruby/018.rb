def big_tree
  tree = []
  tree << [75]
  tree << [95,64]
  tree << [17,47,82]
  tree << [18,35,87,10]
  tree << [20,04,82,47,65]
  tree << [19,01,23,75,03,34]
  tree << [88,02,77,73,07,63,67]
  tree << [99,65,04,28,06,16,70,92]
  tree << [41,41,26,56,83,40,80,70,33]
  tree << [41,48,72,33,47,32,37,16,94,29]
  tree << [53,71,44,65,25,43,91,52,97,51,14]
  tree << [70,11,33,28,77,73,17,78,39,68,17,57]
  tree << [91,71,52,38,17,14,91,43,58,50,27,29,48]
  tree << [63,66,04,68,89,53,67,30,73,16,69,87,40,31]
  tree << [04,62,98,27,23,9,70,98,73,93,38,53,60,04,23]

  tree
end

def small_tree
  tree = []
  tree << [3]
  tree << [7, 4]
  tree << [2,4,6]
  tree << [8,5,9,3]

  tree
end

def max(tree)
  max_row(tree, 0) 
end

def max_row(tree, row)
  return tree[row] if row == tree.count - 1

  next_row = max_row(tree, row + 1)

  tree[row].each_with_index.map do |value, index|
    value + [next_row[index], next_row[index + 1]].max
  end
end

