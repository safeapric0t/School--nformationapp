import React, { useState } from 'react';
import { Bell, School } from 'lucide-react';
import Header from './components/Header';
import AnnouncementList from './components/AnnouncementList';
import AdminPanel from './components/AdminPanel';
import { Announcement } from './types';

const App: React.FC = () => {
  const [announcements, setAnnouncements] = useState<Announcement[]>([
    { id: 1, title: 'Welcome Back!', content: 'We hope you had a great summer break. Classes start next Monday.', date: '2023-09-01' },
    { id: 2, title: 'New Library Hours', content: 'The library will now be open until 9 PM on weekdays.', date: '2023-09-03' },
  ]);

  const addAnnouncement = (newAnnouncement: Omit<Announcement, 'id'>) => {
    setAnnouncements([
      { id: Date.now(), ...newAnnouncement },
      ...announcements,
    ]);
  };

  return (
    <div className="min-h-screen bg-gray-100">
      <Header />
      <main className="container mx-auto px-4 py-8">
        <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
          <div className="md:col-span-2">
            <h2 className="text-2xl font-bold mb-4 flex items-center">
              <Bell className="mr-2" /> Announcements
            </h2>
            <AnnouncementList announcements={announcements} />
          </div>
          <div>
            <h2 className="text-2xl font-bold mb-4 flex items-center">
              <School className="mr-2" /> Admin Panel
            </h2>
            <AdminPanel onAddAnnouncement={addAnnouncement} />
          </div>
        </div>
      </main>
    </div>
  );
};

export default App;