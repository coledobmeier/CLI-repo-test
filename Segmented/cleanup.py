import RPi.GPIO as GPIO
import time
GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

x = 0
while x < 28:
	GPIO.setup(x,GPIO.OUT)
	x+=1

y = 0
while y < 28:
	GPIO.setup(y,GPIO.HIGH)
	y+=1

z = 0
while z < 28:
	GPIO.setup(z,GPIO.LOW)
	z+=1

