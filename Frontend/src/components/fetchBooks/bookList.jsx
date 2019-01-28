import React from 'react';
import '../contents/css/bookList/bookList.css';
import { connect } from 'react-redux';
import { getBooks } from '../action/booksAction';
import { Link } from 'react-router-dom';
import { removeBook } from '../action/booksAction';
import Swal from 'sweetalert2';
import { Table, Button, ButtonGroup } from 'reactstrap';

class BookList extends React.Component {

    constructor(props) {
        super(props);
        this.state = {};
    }

    componentWillMount() {
        this.props.dispatch(getBooks());
    }

    deleteBook(id) {
        this.props.dispatch(removeBook({ id }));
        Swal({
            type: 'success',
            title: '<i>Success!</i>',
            text: 'Book Id '+id+' Deleted Successfully!',
            confirmButtonText: '<i class="fa fa-thumbs-up"></i> Great!',
            confirmButtonAriaLabel: 'Thumbs up, great!',
            buttonsStyling: false,
            confirmButtonClass: 'btn btn-danger btn-lg'
          });
          this.props.history.push('/');
    }
    
    render() {

        const booklistheadjsx = <h1 id="setHead">Fetch Books</h1>;

        const booklisttablejsx = <Table striped responsive>
        <thead className="setTabHead">
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Description</th>
                <th>Author</th>
                <th>Published</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody className="setTabBody">
            {this.props.books.map(book => { return (
            <tr key={book.id}>
                <td>{book.id}</td>
                <td>{book.title}</td>
                <td>{book.description}</td>
                <td>{book.author}</td>
                <td>{book.published}</td>
                <td>
                    <ButtonGroup>
                        <Button color="primary" tag={Link} to={`/editbk/${book.id}`}>Edit</Button>&nbsp;&nbsp;
                        <Button color="danger" onClick={this.deleteBook.bind(this, book.id)}>Delete</Button>
                    </ButtonGroup>
                </td>
            </tr>
            ); })}
        </tbody>
    </Table>;

        return (
<div>
    <div class="text-center" id="jumb">
        {booklistheadjsx}
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-12">
                {booklisttablejsx}
            </div>
        </div>
    </div>
</div>
        );
    }
}

const mapStateToProps = (state) => {
    return {
        books: state
    };
}
export default connect(mapStateToProps)(BookList);
