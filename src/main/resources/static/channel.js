// get the user from session storage
let user = sessionStorage.getItem("user");

// function to handle message submission
function submitMessage() {
  // get the message input value
  let messageInput = document.getElementById("messageInput");
  let message = messageInput.value;

  // add the user to the message
  let messageWithUser = `${user}: ${message}`;

  // create a new message element
  let newMessageElement = document.createElement("div");
  newMessageElement.classList.add("message");
  newMessageElement.innerText = messageWithUser;

  // get the messages container and add the new message to the top
  let messagesContainer = document.getElementById("messagesContainer");
  messagesContainer.insertBefore(newMessageElement, messagesContainer.firstChild);

  // clear the message input
  messageInput.value = "";
}