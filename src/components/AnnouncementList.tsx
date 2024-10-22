import React from 'react';
import { Announcement } from '../types';

interface AnnouncementListProps {
  announcements: Announcement[];
}

const AnnouncementList: React.FC<AnnouncementListProps> = ({ announcements }) => {
  return (
    <div className="space-y-4">
      {announcements.map((announcement) => (
        <div key={announcement.id} className="bg-white rounded-lg shadow-md p-6">
          <h3 className="text-xl font-semibold mb-2">{announcement.title}</h3>
          <p className="text-gray-600 mb-4">{announcement.content}</p>
          <p className="text-sm text-gray-500">Posted on: {announcement.date}</p>
        </div>
      ))}
    </div>
  );
};

export default AnnouncementList;