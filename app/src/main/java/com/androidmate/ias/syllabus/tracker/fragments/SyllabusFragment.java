package com.androidmate.ias.syllabus.tracker.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.androidmate.ias.syllabus.tracker.R;
import com.androidmate.ias.syllabus.tracker.adapters.SyllabusAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Diva on 12/2/2016.
 */

public class SyllabusFragment extends Fragment {

    ListView lv;
    SyllabusAdapter adapter;
    AdView mAdView;

    ArrayList<String> syllabus = new ArrayList<>(Arrays.asList("Units and Dimensions","Vectors and Elementary Calculus","Errors & Measurements","Kinematics","Laws of Motion","Circular Motion","Work, Energy and Power","Centre Of Mass, Momentum and Collisions" ,"Rotational Mechanics","Gravitation","Fluids","Mechanical Properties of Solids","SHM and Oscillatory Motion","Wave Motion and Waves on a string","Sound Waves","Geometrical Optics","Wave Optics","Thermal Expansion and Calorimetry","Kinetic Theory of Gases","Thermodynamics","Specific Heat Capacities of Gases","Heat Transfer" ,"Electric Field and Potential","Capacitors","Current and Electricity","Force due to Magnetic Field","Magnetic Field due to current" ,"Electromagnetic Induction","Alternating Current" ,"Dual Nature of Matter and Photoelectric Effect","Bohr’s Model of an Atom","X-rays"));
    ArrayList<String> position = new ArrayList<>(Arrays.asList("1","2","3"));
    boolean[] checkBoxState;

    ArrayList<String> gsp = new ArrayList<>(Arrays.asList("Current events of national and international importance.","History of India and Indian National Movement.","Indian and World Geography - Physical, Social, Economic Geography of India and the World.","Indian Polity and Governance - Constitution, Political System, Panchayati Raj, Public Policy, Rights Issues, etc.","Economic and Social Development - Sustainable Development, Poverty, Inclusion, Demographics, Social Sector initiatives, etc.","General issues on Environmental Ecology, Bio-diversity and Climate Change","General Science"));
    ArrayList<String> gs1 = new ArrayList<>(Arrays.asList("Indian culture will cover the salient aspects of Art Forms, Literature and Architecture from ancient to modern times.","Modern Indian history from about the middle of the eighteenth century until the present significant events, personalities, issues.","The Freedom Struggle - its various stages and important contributors or contributions from different parts of the country.","Post-independence consolidation and reorganization within the country.\",\"History of the world will include events from 18th century such as industrial revolution, world wars, redrawal of national boundaries, colonization, decolonization, political philosophies like communism, capitalism, socialism etc. - their forms and effect on the society.","Salient features of Indian Society, Diversity of India.","Role of women and women's organization, population and associated issues, poverty and developmental issues, urbanization, their problems and their remedies.","Effects of globalization on Indian society.","Social empowerment, communalism, regionalism & secularism.","Salient features of world's physical geography.","Distribution of key natural resources across the world (including South Asia and the Indian subcontinent); factors responsible for the location of primary, secondary, and tertiary sector industries in various parts of the world (including India).","Important Geophysical phenomena such as earthquakes, Tsunami, Volcanic activity, cyclone etc., geographical features and their location - changes in critical geographical features (including waterbodies and ice-caps) and in flora and fauna and the effects of such changes."));
    ArrayList<String> gs2 = new ArrayList<>(Arrays.asList("Functions and responsibilities of the Union and the States, issues and challenges pertaining to the federal structure, devolution of powers and finances up to local levels and challenges therein","Separation of powers between various organs dispute redressal mechanisms and institutions","Comparison of the Indian constitutional scheme with that of other countries","Parliament and State Legislatures - structure, functioning, conduct of business, powers & privileges and issues arising out of these","Structure, organization and functioning of the Executive and the Judiciary Ministries and Departments of the Government; pressure groups and formal/informal associations and their role in the Polity","Salient features of the Representation of People's Act","Appointment to various Constitutional posts, powers, functions and responsibilities of various Constitutional Bodies","Statutory, regulatory and various quasi-judicial bodies","Government policies and interventions for development in various sectors and issues arising out of their design and implementation","Development processes and the development industry- the role of NGOs, SHGs, various groups and associations, donors, charities, institutional and other stakeholders","Welfare schemes for vulnerable sections of the population by the Centre and States and the performance of these schemes; mechanisms, laws, institutions and Bodies constituted for the protection and betterment of these vulnerable sections","Issues relating to development and management of Social Sector or Services relating to Health, Education, Human Resources","Issues relating to poverty and hunger","Important aspects of governance, transparency and accountability, e-governance- applications, models, successes, limitations, and potential; citizens charters, transparency & accountability and institutional and other measures","Role of civil services in a democracy","India and its neighborhood- relations","Bilateral, regional and global groupings and agreements involving India and/or affecting India's interests","Effect of policies and politics of developed and developing countries on India's interests, Indian diaspora","Important International institutions, agencies and fora- their structure, mandate"));
    ArrayList<String> gs3 = new ArrayList<>(Arrays.asList("Indian Economy and issues relating to planning, mobilization of resources, growth, development and employment","Inclusive growth and issues arising from it","Government Budgeting","Major crops cropping patterns in various parts of the country, different types of irrigation and irrigation systems storage, transport and marketing of agricultural produce and issues and related constraints; e-technology in the aid of farmers","Issues related to direct and indirect farm subsidies and minimum support prices; Public Distribution System- objectives, functioning, limitations, revamping; issues of buffer stocks and food security; Technology missions; economics of animal-rearing","Food processing and related industries in India- scope and significance, location, upstream and downstream requirements, supply chain management","Land reforms in India","Effects of liberalization on the economy, changes in industrial policy and their effects on industrial growth","Infrastructure: Energy, Ports, Roads, Airports, Railways, etc.","Investment models","Science and Technology - developments and their applications and effects in everyday life Achievements of Indians in science & technology; indigenization of technology and developing new technology","Awareness in the fields of IT, Space, Computers, robotics, nano-technology, bio-technology and issues relating to intellectual property rights","Conservation, environmental pollution and degradation, environmental impact assessment","Disaster and disaster management","Linkages between development and spread of extremism","Role of external state and non-state actors in creating challenges to internal security","Challenges to internal security through communication networks, role of media and social networking sites in internal security challenges, basics of cyber security; money-laundering and its prevention","Security challenges and their management in border areas; linkages of organized crime with terrorism","Various Security forces and agencies and their mandate"));
    ArrayList<String> gs4 = new ArrayList<>(Arrays.asList("Ethics and Human Interface: Essence, determinants and consequences of Ethics in human actions; dimensions of ethics; ethics in private and public relationships. Human Values – lessons from the lives and teachings of great leaders, reformers and administrators; role of family, society and educational institutions in inculcating values","Attitude: content, structure, function; its influence and relation with thought and behaviour; moral and political attitudes; social influence and persuasion","Aptitude and foundational values for Civil Service , integrity, impartiality and non-partisanship, objectivity, dedication to public service, empathy, tolerance and compassion towards the weaker sections","Emotional intelligence-concepts, and their utilities and application in administration and governance","Contributions of moral thinkers and philosophers from India and world","Public/Civil service values and Ethics in Public administration: Status and problems; ethical concerns and dilemmas in government and private institutions; laws, rules, regulations and conscience as sources of ethical guidance; accountability and ethical governance; strengthening of ethical and moral values in governance; ethical issues in international relations and funding; corporate governance","Probity in Governance: Concept of public service; Philosophical basis of governance and probity; Information sharing and transparency in government, Right to Information, Codes of Ethics, Codes of Conduct, Citizen's Charters, Work culture, Quality of service delivery, Utilization of public funds, challenges of corruption","Case Studies on above issues"));


    String id,state;

    public SyllabusFragment(){

    }

    public  SyllabusFragment(String id, ArrayList<String> list){
        this.id = id;
        syllabus = new ArrayList<>(list);
        checkBoxState = new boolean[syllabus.size()];
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_syllabus,container,false);
        mAdView = (AdView) v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("A9636149FD57C0D52A7FD275CD84433F")
                .build();
        mAdView.loadAd(adRequest);

        if(id.equals("0")) {
            SharedPreferences preferences = getContext().getSharedPreferences("Syllabus", getContext().MODE_PRIVATE);
            state = preferences.getString("gsp", null);
        }else if (id.equals("1")){

            SharedPreferences preferences = getContext().getSharedPreferences("Syllabus", getContext().MODE_PRIVATE);
            state = preferences.getString("gs1", null);

        }else if (id.equals("2")){

            SharedPreferences preferences = getContext().getSharedPreferences("Syllabus", getContext().MODE_PRIVATE);
            state = preferences.getString("gs2", null);

        }else if (id.equals("3")){
            SharedPreferences preferences = getContext().getSharedPreferences("Syllabus", getContext().MODE_PRIVATE);
            state = preferences.getString("gs3", null);

        }else if (id.equals("4")){
            SharedPreferences preferences = getContext().getSharedPreferences("Syllabus", getContext().MODE_PRIVATE);
            state = preferences.getString("gs4", null);

        }

        if(state != null){
            ArrayList<String> temp = new ArrayList<>(Arrays.asList(state.split(",")));
            for(int i=0;i<temp.size();i++){
                checkBoxState[i] = Boolean.parseBoolean(temp.get(i));
            }
        }


        lv = (ListView) v.findViewById(R.id.lvSyllabus);
        adapter = new SyllabusAdapter(getContext(),id,syllabus,checkBoxState);
        lv.setAdapter(adapter);
        return v;
    }

}
