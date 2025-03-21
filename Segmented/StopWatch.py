# Importing modules and classes
import RPi.GPIO as GPIO
import tm1637
import time
GPIO.setmode(GPIO.BCM)

# Creating 4-digit 7-segment display object
tm = tm1637.TM1637(clk=18, dio=17)  # Using GPIO pins 18 and 17
clear = [0, 0, 0, 0]  # Defining values used to clear the display

#Setting up the button
button =  16
GPIO.setup(button, GPIO.IN)

#Lightbulb
bulb = 26
GPIO.setup(bulb, GPIO.OUT)
light = False

while True:
	try:
		if not GPIO.input(button) and not light:
			time.sleep(.25)
			GPIO.output(bulb, GPIO.HIGH)
			light = True
			mins = 0
			secs = 0
			tm.numbers(mins, secs)

		elif not GPIO.input(button) and light:
			time.sleep(.25)
			GPIO.output(bulb, GPIO.LOW)
			tm.write(clear)
			light = False

		elif GPIO.input(button) and light:
			time.sleep(1)
			if mins == 59 and secs == 59:
				mins = 0
				secs = 0
			elif secs == 59:
				mins += 1
				secs = 0
			else:
				secs += 1
			tm.numbers(mins, secs)
	except KeyboardInterrupt:
		break
GPIO.output(bulb, GPIO.LOW)
GPIO.output(18, GPIO.LOW)
GPIO.output(17, GPIO.LOW)
GPIO.cleanup()
