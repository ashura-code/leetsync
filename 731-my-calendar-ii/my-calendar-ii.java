class Event {
     int start;
     int end;
     public Event(int start,int end){ 
          this.start = start;
          this.end = end;
     }
}


class MyCalendarTwo {
    List<Event> overLapBookings;
    List<Event> bookings; 

    public MyCalendarTwo() {
        overLapBookings = new ArrayList<>();
        bookings = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(Event e:overLapBookings){ 
             if(overlapping(e,start,end)) return false;
        }
        for(Event e:bookings){ 
              if(overlapping(e,start,end)){ 
                  overLapBookings.add(merge_timings(e,start,end));  
              }
        }
        bookings.add(new Event(start,end));
        return true;
    }

    public boolean overlapping(Event e,int start,int end){ 
        return Math.max(e.start,start) < Math.min(e.end,end);
    }
    public Event merge_timings(Event e,int start,int end){ 
          return new Event(Math.max(e.start,start),Math.min(e.end,end));
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */