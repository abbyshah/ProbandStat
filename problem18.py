import sys
orig_stdout = sys.stdout
f = file('out.txt', 'w')
sys.stdout = f

for N in range(1, 365 + 1):
  p = 1.0

  for i in range(1, N + 1):
    p = p * (365 - i + 1) / 365

  p = 1 - p

  print N, p

sys.stdout = orig_stdout
f.close()
