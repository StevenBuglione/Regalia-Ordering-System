//Function to get all of the form data a place it in the modal
function getModalData(){
    //Getting form data and storing it in block scope variables
    let firstName = document.getElementById("firstName").value;
    let lastName = document.getElementById("lastName").value;
    let email = document.getElementById("email").value;
    let phoneNumber = document.getElementById("phoneNumber").value;
    let department = document.getElementById("department").value;
    let capSize = document.getElementById("capSize").value;
    let degree = document.getElementById("degree").value;
    let weight = document.getElementById("weight").value;
    let height = document.getElementById("height").value;
    let grantingInstitution = document.getElementById("grantingInstitution").value;
    let institutionState = document.getElementById("institutionState").value;
    let institutionCity = document.getElementById("institutionCity").value;
    let ceremonyDate = document.getElementById("ceremonyDate").value;


    //Getting modal element by id
    let FirstName = document.getElementById("FirstName");
    let LastName = document.getElementById("LastName");
    let Email = document.getElementById("Email");
    let PhoneNumber = document.getElementById("PhoneNumber");
    let Department = document.getElementById("Department");
    let CapSize = document.getElementById("CapSize");
    let Degree = document.getElementById("Degree");
    let Weight = document.getElementById("Weight");
    let Height = document.getElementById("Height");
    let GrantingInstitution = document.getElementById("GrantingInstitution");
    let InstitutionState = document.getElementById("InstitutionState");
    let InstitutionCity = document.getElementById("InstitutionCity");
    let CeremonyDate = document.getElementById("CeremonyDate");

    //A dirty method to parse the height value to correct format
    if(height.length == 3){
            var feet = height.slice(0,1)
            var inches = height.slice(2)
            var height_feet_inches = feet + "'" + inches +'"';

            Height.textContent = height_feet_inches;

        }else{
            var feet = height.slice(0,1)
            var inches = height.slice(2,3)
            var height_feet_inches = feet + "'" + inches +'"';

            Height.textContent = height_feet_inches;
        }




    //Setting the Modal Data with the form Data
    FirstName.textContent = firstName;
    LastName.textContent = lastName;
    Email.textContent = email;
    PhoneNumber.textContent = phoneNumber;
    Department.textContent = department;
    CapSize.textContent = capSize;
    Degree.textContent = degree;
    Weight.textContent = weight;
    GrantingInstitution.textContent = grantingInstitution;
    InstitutionState.textContent = institutionState;
    InstitutionCity.textContent = institutionCity;
    CeremonyDate.textContent = ceremonyDate;

   
}



