import React from 'react';

export default function CourseDetails({ courses }) {
  let content;
  if (courses.length > 0) { 
    content = (
      <div>
        {courses.map(course => (
          <div key={course.id}>
            <h3>{course.name}</h3>
            <p>{course.date}</p>
          </div>
        ))}
      </div>
    );
  } else {
    content = <h3>No Courses Found</h3>;
  }
  return (
    <div>
      <h1>Course Details</h1>
      {content}
    </div>
  );
}
