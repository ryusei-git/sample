# import
from apiclient.discovery import build
# Youtube API settings
API_KEY = 'AIzaSyDHXuxMA-k1dOC9SSv7G5WhhNAqz5f_TEo'
YOUTUBE_API_SERVICE_NAME = 'youtube'
YOUTUBE_API_VERSION = 'v3'
youtube = build(
    YOUTUBE_API_SERVICE_NAME,
    YOUTUBE_API_VERSION,
    developerKey=API_KEY
)
def get_video_info(keyword):
    # search settings
    youtube_query = youtube.search().list(
        part='id,snippet',
        q=keyword,
        type='video',
        maxResults=50,
        order='rating',
    )
    # search_execute
    youtube_response = youtube_query.execute()
    # return responce
    return youtube_response.get('items', [])
    # get_video_info execute
data = get_video_info("java")

# result output
for video in data:
    print(video['id']['videoId'])
    youtube.video()