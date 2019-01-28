import React from 'react';
import { connect } from 'react-redux';
import { editBook } from '../action/booksAction';
import UpdateBookForm from './updateBookForm';
import Swal from 'sweetalert2';

const EditBook = (props) => {
    return (
        <div>
            <UpdateBookForm
            book={props.book}
            onSubmitBook={(book) => {
                props.dispatch(editBook(props.book.id, book));
                Swal({
                    type: 'success',
                    title: '<i>Success!</i>',
                    text: 'Book Id '+props.book.id+' Updated Successfully!',
                    confirmButtonText: '<i class="fa fa-thumbs-up"></i> Great!',
                    confirmButtonAriaLabel: 'Thumbs up, great!',
                    buttonsStyling: false,
                    confirmButtonClass: 'btn btn-info btn-lg'
                  });
                props.history.push('/');
            }}
        />  
        </div>
    );
};

const mapStateToProps = (state, props) => {
    return {
        book: state.find((book) =>
            book.id === props.match.params.id)
    };
};
export default connect(mapStateToProps)(EditBook);
