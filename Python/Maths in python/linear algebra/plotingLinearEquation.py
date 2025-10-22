import numpy as np
import matplotlib.pyplot as plt 
# robber running at 2.5 m/sec and cop running at 3 m/sec and cop got 5 min head start calcuate when they meet and plot it on graph

t=np.linspace(0,40,1000) # start value, # end value, and how evenly spaced values will be, linspace creates a list of evenly spaced numbers between two values 

distanceRobber=2.5*t
distanceCop=3*(t-5)

plt.title('A Bang Robber')
plt.xlabel('time (in min)')
plt.ylabel('distance in KM')
plt.xlim([0,40])
plt.ylim([0,100])
plt.plot(t,distanceRobber,c='green')
plt.plot(t,distanceCop,c='red')
plt.axvline(x=30,color='purple',linestyle='--')
_=plt.axhline(y=75,color='purple',linestyle='--')
plt.show()

