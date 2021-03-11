import sys
import random
limit,calls = 2,0
# This method is used to generate a list with random values.
def generate(balls,size):
    maximum = 25; # maximum ball weight 25 oz, assuming weight distributed between 19 and 25
    genuine_weight = random.randint(20,maximum)
    defective_weight = random.randint(30,genuine_weight+30)
    if (genuine_weight == defective_weight):
        defective_weight = genuine_weight - 1
    defective_position = random.randint(0, size-1);
    for i in range(0,size):
        if (i != defective_position):
            balls.insert(i,genuine_weight)
    balls.insert(defective_position,defective_weight)

def balance(balls,left,right):  
    global calls
    if (calls == limit):
        print(f"The program is quitting because balance is called more than {limit} times ...")
        sys.exit(0)
    else:
        calls += 1
    lsum = 0
    for i in range(left.get("start"),left.get("end")+1):
        lsum += balls[i]
    rsum = 0
    for i in range(right.get("start"),right.get("end")+1):
        rsum += balls[i]
    if (lsum == rsum):    
        return 0
    elif (lsum > rsum):
        return -1
    else:
        return 1

def puzzle(balls):
    result = 0
    # add your logic here by removing pass below ...
    return result

balls = []
size = 9
generate(balls,size)
print(balls)
result = puzzle(balls)
print(result)
balls = []