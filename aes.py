from Crypto.Cipher import AES
from secrets import token_bytes  

key = token_bytes(16)

cipher = AES.new(key, AES.MODE_EAX)

msg = "Welcome to Sanjivani"
data = msg.encode()  

nonce = cipher.nonce

ciphertext = cipher.encrypt(data)

print("Cipher text:", ciphertext)

cipher = AES.new(key, AES.MODE_EAX, nonce=nonce)

plaintext = cipher.decrypt(ciphertext).decode()  

print("Plain text:", plaintext)
