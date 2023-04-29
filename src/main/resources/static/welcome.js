let newName = prompt("Please enter your name:");
var user = {
	"namez": newName
}
getUserByName(user)
function getUserByName(name) {
    return fetch(`/user?name=${name}`, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(response => {
        if (response.ok) {
            return response.json();
        } else {
            throw new Error('There was a problem with the fetch operation.');
        }
    })
    .catch(error => {
        console.error(error);
    });
}
fetch('/user',{
	method: 'POST',
	headers: {
		'Content-Type':'application/json'
	},
	body: JSON.stringify(user)
	})

alert("Hello, " + newName + "!");