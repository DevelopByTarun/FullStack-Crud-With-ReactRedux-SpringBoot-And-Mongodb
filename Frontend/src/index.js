import React from 'react';
import ReactDOM from 'react-dom';
import { App } from './App';
import getBooksStore from './components/store/booksStore';
import { Provider } from 'react-redux';

const store = getBooksStore();

const structure = (
    <Provider store={store}>
        <App/>
    </Provider>
);

ReactDOM.render(structure, document.getElementById('root'));
