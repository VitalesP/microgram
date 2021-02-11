let user = {
    id: indexedDB,
    name: '',
    email: '',
    password: '',
    isAutorised: this.isAutorised,
    publication: addPost(this.publication) //у каждого пользователя есть посты. поист постов по юзеру будет проще, логичнее
};

let publication = {
    id: indexedDB,
    image: '',
    description: '',
    LocalDate: new Date,
    comment: addComment(this.comment)
}
    //в постах есть коментарий а у комента есть автор, думаю поиск делать логичнее.
let comment = {
    id: indexedDB,
    text: '',
    LocalDate: new Date,
    user: user,
    isLiked: this.isLiked
}

let publications = [];
function addPost(publications) {
    publications.push(publication);
}

let comment = [];
function addComment(comment) {
    comment.push(comment);
}

function changeAutorised(user) {
    if (user.isAutorised === false) {
        user.isAutorised = true;
    }
}

function changeLike(publications_id) {
    if(publications.includes(id) === true) {
        if (publication.isLiked === false) {
            publication.isLike = true;
        }
        else {
            publication.isLiked = false;
        }
    }
}