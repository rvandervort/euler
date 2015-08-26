require 'rubygems'
require 'rspec'
load '17.rb'

describe Fixnum do
  describe "#to_word" do
    vals = {
      8 => "eight",
      10 => "ten",
      12 => "twelve",
      123 => "one hundred and twenty three",
      200 => "two hundred",
      342 => "three hundred and forty two",
      576 => "five hundred and seventy six",
      911 => "nine hundred and eleven"
    }

    vals.each do |num, expected|
      it "returns '#{expected}' for value : #{num}" do
        num.to_word.should == expected
      end
    end
  end
end


describe String do
  describe "#stripped_length" do
    phrases = {
      "three hundred and forty-two" => 23,
      "one hundred and fifteen" => 20
    }

    phrases.each do |phrase, length|
      it "returns #{length} for the phrase '#{phrase}'" do
        phrase.stripped_length.should == length
      end
    end
  end
end
