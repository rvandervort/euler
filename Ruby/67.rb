load '18.rb'

def load_tree
  tree = []

  lines = nil
  File.open("./67_triangle.txt") do |f|
    while line = f.gets
      tree << line.split(" ").map(&:to_i)
    end
  end

  tree
end
