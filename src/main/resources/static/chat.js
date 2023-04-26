const socket = new WebSocket('ws://localhost:8080');

socket.addEventListener('open', (event) => {
	console.log('WebSocket connection established.');
});

socket.addEventListener('message', (event) => {
	console.log(`Received message: ${event.data}`);
	// Handle incoming message
});
const messageForm = document.getElementById('message-form');
const messageInput = document.getElementById('message-input');

messageForm.addEventListener('submit', (event) => {
	event.preventDefault();

	const message = messageInput.value.trim();
	if (message) {
		socket.send(message);
		messageInput.value = '';
	}
});
const messagesContainer = document.getElementById('messages');

socket.addEventListener('message', (event) => {
	const message = event.data;
	messagesContainer.innerHTML += `<p>${message}</p>`;
});
window.addEventListener('load', () => {
	socket.addEventListener('open', (event) => {
		console.log('WebSocket connection established.');
	});
});