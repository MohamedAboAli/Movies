package com.example.android.movies;

import java.util.List;


public class movieData {
    private int page;
    private int total_results;
    private int total_pages;


    private List<ResultsEntity> results;

    public void setPage(int page) {
        this.page = page;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public void clearList(){
        results.clear();
    }
    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }
    public ResultsEntity SpecificMovieInfo(int position){
        return results.get(position);
    }

    public static class ResultsEntity {
        private String poster_path;
        private boolean adult;
        private String overview;
        private String release_date;
        private String id;
        private String original_title;
        private String original_language;
        private String title;
        private String backdrop_path;
        private double popularity;
        private int vote_count;
        private boolean video;
        private String vote_average;
        private List<Integer> genre_ids;
        private List<String> trialsKeys;

        public List<String> getTrialsKeys() {
            return trialsKeys;
        }

        public void setTrialsKeys(List<String> trialsKeys) {
            this.trialsKeys = trialsKeys;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public List<String> getReview_content() {
            return review_content;
        }

        public void setReview_content(List<String> review_content) {
            this.review_content = review_content;
        }

        private List<String> author;
        private List<String> review_content;


        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public void setVote_average(String vote_average) {
            this.vote_average = vote_average;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public boolean isAdult() {
            return adult;
        }

        public String getOverview() {
            return overview;
        }

        public String getRelease_date() {
            return release_date;
        }

        public String getId() {
            return id;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public String getTitle() {
            return title;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public double getPopularity() {
            return popularity;
        }

        public int getVote_count() {
            return vote_count;
        }

        public boolean isVideo() {
            return video;
        }

        public String getVote_average() {
            return vote_average;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }
    }
}
