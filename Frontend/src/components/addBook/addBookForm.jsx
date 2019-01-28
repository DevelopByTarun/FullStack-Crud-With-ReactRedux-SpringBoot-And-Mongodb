import React from 'react';
import '../contents/css/addBookForm/addBookForm.css';
import Swal from 'sweetalert2';

class AddBookForm extends React.Component {

    constructor(props) {
        super(props);
        this.onTitleChange = this.onTitleChange.bind(this);
        this.onAuthorChange = this.onAuthorChange.bind(this);
        this.onDescriptionChange = this.onDescriptionChange.bind(this);
        this.onPublishedChange = this.onPublishedChange.bind(this);
        this.onSubmit = this.onSubmit.bind(this);

        this.state = {
            title: props.book ? props.book.title : '',
            author: props.book ? props.book.author : '',
            description: props.book ? props.book.description : '',
            published: props.book ? props.book.published : ''
        };
    }

    onTitleChange(e) {
        const title = e.target.value;
        this.setState(() => ({ title: title }));
    }

    onAuthorChange(e) {
        const author = e.target.value;
        this.setState(() => ({ author: author }));
    }

    onDescriptionChange(e) {
        const description = e.target.value;
        this.setState(() => ({ description: description }));
    }

    onPublishedChange(e) {
        const published = e.target.value;
        this.setState(() => ({ published: published }));
    }

    onSubmit(e) {
        e.preventDefault();

        if (!this.state.title || !this.state.author || !this.state.published) {
            Swal({
                type: 'error',
                title: '<i>Error!</i>',
                text: 'Please set title, author, description & published!',
                confirmButtonText: '<i class="fa fa-thumbs-down"></i> Sorry!',
                confirmButtonAriaLabel: 'Thumbs down',
                buttonsStyling: false,
                confirmButtonClass: 'btn btn-dark btn-lg'
              });
        } else {
            this.props.onSubmitBook(
                {
                    title: this.state.title,
                    author: this.state.author,
                    description: this.state.description,
                    published: this.state.published
                }
            );
        }
    }

    render() {

        const addbookformheadjsx = <h1 id="setHead">Add Book</h1>;

        const addbookformjsx = <div class="login-w3l">
        <div class="top-img-agileits-w3layouts">
            <h2 class="sub-head-w3-agileits" id="set_fonty">Add Here!</h2>
        </div>
        <div class="login-form">
            <form onSubmit={this.onSubmit}>
                <input type="text" class="animated fadeInLeftBig add1_animation" value={this.state.title} onChange={this.onTitleChange} placeholder="Enter Book Title"/>
                <input type="text" class="animated fadeInRightBig add2_animation" value={this.state.description} onChange={this.onDescriptionChange} placeholder="Enter Book Description"/>
                <input type="text" class="animated fadeInLeftBig add1_animation" value={this.state.author} onChange={this.onAuthorChange} placeholder="Enter Book Author"/>
                <input type="text" class="animated fadeInRightBig add2_animation" value={this.state.published} onChange={this.onPublishedChange} placeholder="Enter Book Published"/>
                <input type="submit" id="setBtnLabel" className="text-center animated fadeInDownBig add4_animation" value="Add"/>
            </form>
        </div>
    </div>;

        return (
<div>
    <div class="text-center" id="jumb">
        {addbookformheadjsx}
    </div>
    <div class="container-fluid">
        <div class="row" id="setAddBack">
            <div class="col-sm-12">
            <br/>
            {addbookformjsx}
            <div class="clear"></div>
            <br/>    
            </div>
        </div>
    </div>
</div>
        );
    }
}
export default AddBookForm;
