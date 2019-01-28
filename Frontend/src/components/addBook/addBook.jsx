import React from 'react';
import { connect } from 'react-redux';
import AddBookForm from './addBookForm';
import { addBook } from '../action/booksAction';
import Swal from 'sweetalert2';

const AddBook = (props) => {
    return (
        <div>
            <AddBookForm
            onSubmitBook={(book) => {
                props.dispatch(addBook(book));
                Swal({
                    type: 'success',
                    title: '<i>Success!</i>',
                    text: 'Book Added Successfully!',
                    confirmButtonText: '<i class="fa fa-thumbs-up"></i> Great!',
                    confirmButtonAriaLabel: 'Thumbs up, great!',
                    buttonsStyling: false,
                    confirmButtonClass: 'btn btn-primary btn-lg'
                  });
                props.history.push('/');
            }}
        />  
        </div>
    );
}
export default connect()(AddBook);
