import React from 'react'
import { Route, Redirect, Switch } from 'react-router-dom';
import Home from '../home/home';
import AddBook from '../addBook/addBook';
import BookList from '../fetchBooks/bookList';
import EditBook from  '../updateBook/editBook';
import UpdateBookForm from '../updateBook/updateBookForm';

const Routes = (props) => {
    return (
        <div>
            <Switch>
                <Route path="/" exact component={Home}/>

                <Route path="/addbk" exact component={AddBook}/>

                <Route path="/fetchbk" exact component={BookList}/>

                <Route path="/editbk/:id" exact component={EditBook}/>

                <Route path="/updatebk" exact component={UpdateBookForm}/>

                <Redirect exact to="/"/>
            </Switch>
        </div>
    );
}
export default Routes; 
