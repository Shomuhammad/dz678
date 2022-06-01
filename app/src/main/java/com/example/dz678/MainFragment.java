package com.example.dz678;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz678.databinding.FragmentMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment implements OnStoriesItemClicListenere{

    private FragmentMainBinding binding;
    private StoriesAdapter adapter;
    private PostAdapter postAdapter;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater);
        initStories();
        initPosts();
        return binding.getRoot();
    }

    private void initPosts() {
        List<PostModel> post = new ArrayList<>();

        post.add(new PostModel("Shahmuhammed", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Shahmuhammed", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Shahmuhammed", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));
        post.add(new PostModel("Fazilbek", "Osh_Kyrgizstan",
                "Домашнее задание была очен, очен сложным",
                90909090, R.drawable.post));

        postAdapter = new PostAdapter();
        postAdapter.setPosts(post);
        binding.rvPosts.setAdapter(postAdapter);

    }

    private void initStories() {

        List<StoriesModel> list = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();


        list.add(new StoriesModel(true));

        list.add(new StoriesModel("Hasanboy", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Hasanboy", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Hasanboy", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Hasanboy", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Hasanboy", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Hasanboy", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Hasanboy", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Hasanboy", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Fazilbek", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Halid", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Halid", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Halid", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Halid", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Halid", R.drawable.ic_profile,
                integerList, false));
        list.add(new StoriesModel("Halid", R.drawable.ic_profile,
                integerList, false));
        adapter = new StoriesAdapter(list);
        adapter.setClicListenere(this);
        binding.rvStories.setAdapter(adapter);
    }

    @Override
    public void onClick(View view, int position) {

        Navigation.findNavController(view).navigate(R.id.storyFragment);

    }
}