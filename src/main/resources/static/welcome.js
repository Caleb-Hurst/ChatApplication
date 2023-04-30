// Check if the user's name is already stored in session storage
let storedName = sessionStorage.getItem("username");

if (storedName) {
	// User's name is already stored, use it
	var user = {
		"name": storedName
	};
	console.log(user);
	fetch(`/user?name=${user.name}`, {
		method: 'GET',
		headers: {
			'Content-Type': 'application/json'
		}
	}).then(response => response.json()).then(data => console.log(data));
} else {
	// User's name is not stored, prompt for it
	let newName = prompt("Please enter your name:");
	var user = {
		"name": newName
	};
	console.log(user);
	fetch(`/user?name=${user.name}`, {
		method: 'GET',
		headers: {
			'Content-Type': 'application/json'
		}
	}).then(response => response.json()).then(data => console.log(data));

	// Store the user's name in session storage
	sessionStorage.setItem("username", newName);
}



