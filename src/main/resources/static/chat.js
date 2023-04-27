const socket = io(); // connect to the server using Socket.IO

const messageContainer = document.getElementById("message-container");
const messageInput = document.getElementById("message-input");
const sendButton = document.getElementById("send-button");

// prompt user for their name when they visit the page
const name = prompt("What is your name?");
socket.emit("new-user", name);
appendMessage("You joined");

// send a message to the server when the send button is clicked or the form is submitted
sendButton.addEventListener("click", (e) => {
  e.preventDefault();
  const message = messageInput.value;
  if (message.trim() === "") return;
  socket.emit("send-message", message);
  messageInput.value = "";
});

// receive and display messages from the server
socket.on("receive-message", (data) => {
  appendMessage(`${data.name}: ${data.message}`);
});

// add a message to the message container
function appendMessage(message) {
  const messageElement = document.createElement("div");
  messageElement.innerText = message;
  messageContainer.append(messageElement);
}
