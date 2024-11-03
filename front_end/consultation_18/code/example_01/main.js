// fetch("url", {
//     headers: {
//       "Content-Type": "application/json",
//       'Authorization': 'Basic ' + btoa(globalUsername + ":" + globalPassword),
//     },
//     method: "POST",
//     body: moveBody
//   })
//   .then(response => console.log(response.status) || response) // output the status and return response
//   .then(response => response.text()) // send response body to next then chain
//   .then(body => console.log(body)) // you can use response body here



  fetch("https://api.github.com/users/IrinBorin/repos")
    .then((response) => {
      return response.json();
    })
    .then((data) => {
        doSomethingWithData(data)
    })
    .catch(() => {
        alert('SOS');
    })



    function doSomethingWithData(repos) {
        console.log(repos);
        console.log(repos[0]);
        const elementFromRepos = repos.map(
            (OneElementOfArray) => { 
                const liElement = document.createElement('li');
                liElement.textContent = OneElementOfArray.name;
                return liElement;
            }
        )
        console.log(elementFromRepos);
        const liParentElement = document.createElement('ul');
        liParentElement.append(...elementFromRepos);
        document.body.append(liParentElement);
    }

    console.log('TEST');
