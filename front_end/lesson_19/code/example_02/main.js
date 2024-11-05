const getUserInfo = async (userLogin) => {
    const response = await fetch(`https://api.github.com/users/${userLogin}`);
    const allDataAboutUser = await response.json();
    // console.log(allDataAboutUser);
    const responseRepos = await fetch(allDataAboutUser.repos_url);
    const allUserRepos = await responseRepos.json();
    console.log(allUserRepos);
    renderUserInfo(allDataAboutUser.avatar_url, allDataAboutUser.name, allUserRepos);
}

// getUserInfo('facebook');

function renderUserInfo(imgUrl, name, repos) {
    // формируем элемент p с именем владельца репозитория
    const userNameElement = document.createElement('p');
    userNameElement.textContent = name;
    // формируем картинку с аватаркой пользователя
    const userAvatar = document.createElement('img');
    userAvatar.src = imgUrl;
    // формируем ul с репозиториями пользователя
    const listOfRepos = document.createElement('ul');
    const listElementsOfReposNames = repos.map(
        (repoObj) => {
            const repoNameLiElement = document.createElement('li');
            repoNameLiElement.textContent = repoObj.name;
            return repoNameLiElement;
        }
    )
    listOfRepos.append(...listElementsOfReposNames);
    // все сформированные элементы аппендим внутрь body
    document.body.append(userNameElement, userAvatar, listOfRepos);
}
