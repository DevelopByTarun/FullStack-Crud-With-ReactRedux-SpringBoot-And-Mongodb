import axios from 'axios';

// for add book
const _addBook = (book) => ({
    type: 'ADD_BOOK',
    book
});

export const addBook = (bookData = {
    title: '',
    description: '',
    author: '',
    published: 0
}) => {
    return (dispatch) => {
        const book = {
            title: bookData.title,
            description: bookData.description,
            author: bookData.author,
            published: bookData.published
        };

        return axios.post('http://localhost:9191/api/book/create', book).then(result => {
            console.log('Book Added Successfully');
            dispatch(_addBook(result.data));
        });
    };
};


// for fetch books
const _getBooks = (books) => ({
    type: 'GET_BOOKs',
    books
});

export const getBooks = () => {
    return (dispatch) => {
        return axios.get('http://localhost:9191/api/book/fetch').then(result => {
            const books = [];
            result.data.forEach(item => {
                books.push(item);
            });
            console.log('Books Fetch Successfully');
            dispatch(_getBooks(books));
        });
    };
};


// for delete book
const _removeBook = ({ id } = {}) => ({
    type: 'REMOVE_BOOK',
    id
});

export const removeBook = ({ id } = {}) => {
    return (dispatch) => {
        return axios.delete(`http://localhost:9191/api/book/delete/${id}`).then(() => {
            console.log('Book Id '+id+' Deleted Successfully');
            dispatch(_removeBook({ id }));
        })
    }
};


// for edit and update book
const _editBook = (id, updates) => ({
    type: 'EDIT_BOOK',
    id,
    updates
});

export const editBook = (id, updates) => {
    return (dispatch) => {
        return axios.post(`http://localhost:9191/api/book/bookeu/${id}`, updates).then(() => {
            console.log('Book Id '+id+' Updated Successfully');
            dispatch(_editBook(id, updates));
        });
    }
};
