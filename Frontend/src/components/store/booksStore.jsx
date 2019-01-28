import { createStore, applyMiddleware } from "redux";
import thunk from 'redux-thunk';
import booksReducer from '../reducer/booksReducer';

export default () => {
    return createStore(booksReducer, applyMiddleware(thunk));
};