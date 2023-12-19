module AcceptsComments
  def comments
    @comments ||= []
  end

  def add_comment(comment)
    comments << comment
  end
=begin
  attr_reader :comments

  def initialize
    @comments = []
  end
=end

=begin
  def comments
    if @comments
      @comments
    else
      @comments = []
    end
  end
=end
end

class Clip
  def play
    puts "Playing #{object_id}..."
  end
end

class Video < Clip
  include AcceptsComments
  attr_reader :resolution
end

class Song < Clip
  include AcceptsComments
  attr_reader :beats_per_minute
end

class Photo
  include AcceptsComments

  def initialize
=begin
    super
=end
    @format = "JPEG"
  end

  def show
    puts "Displaying #{object_id}..."
  end
end

video = Video.new
video.add_comment("Cool slow motion effect!")
video.add_comment("Weird ending.")
video.play
song = Song.new
song.add_comment("Awesome beat.")
song.play
photo = Photo.new
photo.add_comment("This photo is awesome.")
photo.add_comment("The colors are beautiful.")
photo.show

p video.comments, song.comments, photo.comments
