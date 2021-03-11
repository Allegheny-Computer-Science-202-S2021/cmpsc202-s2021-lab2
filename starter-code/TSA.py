import random
def generate(prices,size):
	maximum = 100; # maximum coin weight 100 grams
	for i in range(0,size):
		prices.insert(i,random.randint(1,maximum))
	
def computeSpan(prices):
	span = []
	# add your logic here to output your result to the span list ...
	return span

prices = []
size = int(input("Enter the no of days:")) # number of days provided by the user
generate(prices,size)
print(prices)
print(computeSpan(prices))
prices = []